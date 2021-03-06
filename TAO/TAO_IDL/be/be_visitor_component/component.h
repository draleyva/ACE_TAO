
//=============================================================================
/**
 *  @file    component.h
 *
 *  Visitors for generation of code for Component.
 *
 *  @author Jeff Parsons
 */
//=============================================================================

#include "ace/Log_Msg.h"

#include "idl_defines.h"
#include "utl_scope.h"
#include "utl_identifier.h"
#include "utl_exceptlist.h"
#include "nr_extern.h"
#include "ast_argument.h"
#include "ast_exception.h"

#include "be_argument.h"
#include "be_connector.h"
#include "be_provides.h"
#include "be_uses.h"
#include "be_publishes.h"
#include "be_emits.h"
#include "be_consumes.h"
#include "be_mirror_port.h"
#include "be_porttype.h"
#include "be_attribute.h"
#include "be_eventtype.h"
#include "be_typedef.h"
#include "be_operation.h"
#include "be_sequence.h"
#include "be_string.h"
#include "be_structure.h"
#include "be_typedef.h"
#include "be_valuetype.h"
#include "be_argument.h"

#include "be_visitor_component.h"
#include "be_visitor_attribute.h"
#include "be_visitor_operation.h"
#include "be_visitor_argument.h"
#include "be_visitor_interface.h"
#include "be_visitor_structure.h"
#include "be_visitor_typedef.h"
#include "be_visitor_context.h"
#include "be_visitor_member_type_decl.h"
#include "be_visitor_attr_setarg_type.h"
#include "be_visitor_attr_assign.h"
#include "be_visitor_attr_return.h"
#include "be_visitor_null_return_value.h"
#include "be_visitor_attr_init.h"
#include "be_util.h"
#include "be_helper.h"
#include "be_identifier_helper.h"
#include "be_extern.h"

#include "be_visitor_argument/argument.h"
#include "be_visitor_argument/arglist.h"

